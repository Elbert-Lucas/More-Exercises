# Perfect City

Consider a city where the streets are perfectly laid out to form an infinite square grid. In this city finding the shortest path between two given points (an origin and a destination) is much easier than in other more complex cities. As a new Uber developer, you are tasked to create an algorithm that does this calculation.

Given user's departure and destination coordinates, each of them located on some street, find the length of the shortest route between them assuming that cars can only move along the streets.

Example

For departure = [0.4, 1] and destination = [0.9, 3] the answer should be 2.7.

[input] array.float departure

An array [x, y] of x and y coordinates. It is guaranteed that at least one coordinate is integer.
[input] array.float destination

The destination is given the same way as the departure location.
[output] float

The shorted distance between two points along the streets.