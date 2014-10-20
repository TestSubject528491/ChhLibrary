function Circle(r) {
  /** @private */ this.radius = r;
}

Circle.prototype.getRadius() {
  return this.radius;
}

Circle.prototype.getCircumference() {
  return 2 * Math.PI * this.radius;
}
