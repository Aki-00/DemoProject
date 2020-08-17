$(function() {
    $(".header").load("header.html");
    $(".body").load("body.html");
    $(".footer").load("footer.html");
});

var groupss = [];

function Group(id, number, name, member, creator, createDate) {
    this.number = number;
    this.name = name;
    this.nmember = member;
    this.creator = creator;
    this.createDate = createDate;
}