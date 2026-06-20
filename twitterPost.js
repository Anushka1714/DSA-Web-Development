//create an objectliteral for the properties of thread/twitter post which includes

const post ={
    username: "@anushkaagrahari",
    content: "This is my #firstPost",
    likes: 150,
    repost: 5,
    tags: ["@aasthasingh","@pakhisrivastava","@anshikabhadauriya"]
}
console.log(post["username"]);
console.log(post.username);

console.log(post["tags"]); // it is giving undefined when we are using indexes
console.log(post.tags[0]);

console.log(post.repost);

