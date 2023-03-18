import supertest from "supertest";
const chai = require("chai");
chai.use(require("chai-json-schema"));
const expect = chai.expect;
const request = supertest("https://jsonplaceholder.typicode.com/");

const schema = require("../schema/get.jsonplaceholder.json");

describe("@post - As User, I want to see all list the data of posts", () => {
  it("@positive - verify the data of posts is success created", async () => {
    const data = {
      title: "recommendation",
      body: "motorcycle",
      userId: 12,
    };

    const response = await request.post("posts").send(data);

    expect(response.status).to.equal(201);
    expect(response._body.title).to.equal(data.title);
    expect(response._body.body).to.equal(data.body);
    expect(response._body.userId).to.equal(data.userId);

    // console.log(response.body.title);
  });
});

describe("@get - As User, I want to see all list the data of posts}", () => {
  it("@positive - verify the data of posts is displayed", async () => {
    const response = await request.get("posts");

    expect(response.status).to.equal(200);
    expect(response._body).to.be.jsonSchema(schema);
  });
});
