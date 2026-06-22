"use strict";
var direction;
(function (direction) {
    direction[direction["up"] = 1] = "up";
    direction[direction["down"] = 2] = "down";
    direction[direction["left"] = 3] = "left";
    direction[direction["right"] = 4] = "right";
})(direction || (direction = {}));
console.log(direction);
console.log(typeof (direction));
