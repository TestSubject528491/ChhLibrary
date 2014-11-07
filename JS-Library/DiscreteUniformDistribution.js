/**
  * Creates a dscrete uniform (constant) distribution with a given number of outcomes.
  * If parameter is not specified, the default paramater is
  * outcomes = 1 (the standard uniform distribution).
  * @param `outcomes` the number of total outcomes
  */
function DiscreteUniformDistribution(outcomes) {
  this.outcomes = (outcomes === undefined) ? 1 : outcomes;
}

/**
  * Returns the output of the probability density function of this distribution.
  * This value is the probability of obtaining any one outcome.
  * @param `x` the input of the PDF to evaluate
  * @return    the y-value of the PDF evaluated at `x`
  */
DiscreteUniformDistribution.prototype.evalPDF = function (x) {
  return 1 / this.outcomes;
}

/**
  * Returns the cumulative distribution function of this distribution.
  * The CDF is the integral of the PDF. It can be statistically interpreted as the probability
  * of obtaining an outcome less than or equal to the input.
  * @param `x` the input of the CDF to evaluate
  * @return    the y-value of the PDF evaluated at `x`
  */
DiscreteUniformDistribution.prototype.evalCDF = function (x) {
  // var sum = 0;
  // for (var i = 0; i <= x; i++) {
  //   sum += this.evalPDF(i);
  // }
  // return sum;
  return this.evalPDF(0) * x;
}

/**
  * Returns the area under the PDF from `min` to `max`.
  * The area under the PDF can be interpreted as the probability of obtaining a datum
  * within the closed interval `[min, max]`.
  * @param `min` the lower bound of the input
  * @param `max` the upper bound of the input
  * @return this.evalCDF(max) - this.evalCDF(min)
  */
DiscreteUniformDistribution.prototype.area = function (min, max) {
  return this.evalCDF(max) - this.evalCDF(min);
}

/** Returns the mean (statistical average) of this distribution. */
DiscreteUniformDistribution.prototype.getMean = function () {
  // var sum = 0;
  // for (var i = 0; i < this.outcomes; i++) {
  //   sum += i * this.evalPDF(i);
  // }
  // return sum;
  return (1 / this.outcomes) * Util.triangular(this.outcomes - 1);
}

/** Returns the standard deviation (statistical spread) of this distribution. */
DiscreteUniformDistribution.prototype.getStdev = function () {
  // var sum = 0;
  // for (var i = 0; i < this.outcomes; i++) {
  //   sum += Math.pow(i - this.getMean(), 2) * this.evalPDF(i);
  // }
  // return sum;
  var sum = 0;
  for (var i = 0; i < this.outcomes; i++) {
    sum += Math.pow(i - this.getMean(), 2);
  }
  return this.evalPDF(i) * sum;
}
