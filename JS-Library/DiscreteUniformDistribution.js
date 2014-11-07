/**
  * Creates a discrete uniform (constant) distribution with a given number of outcomes.
  * @param `outcomes` the number of total outcomes; defaults to 1
  */
function DiscreteUniformDistribution(outcomes) {
  this.outcomes = (outcomes > 0) ? outcomes : 1;
}

/**
  * Returns the output of the probability density function of this distribution.
  * This value is the probability of obtaining any one outcome.
  * @param `x` the input of the PDF to evaluate; defulats to 0
  * @return    the y-value of the PDF evaluated at `x`
  */
DiscreteUniformDistribution.prototype.evalPDF = function (x) {
  if (x === -Infinity || x === Infinity) return 0;
  if ((0 < x || 0 === x) && x < this.outcomes) return 1 / this.outcomes;
  if (isaNumber(x)) return 0;
}

/**
  * Returns the cumulative distribution function of this distribution.
  * The CDF is the integral of the PDF. It can be statistically interpreted as the probability
  * of obtaining an outcome less than or equal to the input.
  * @param `x` the input of the CDF to evaluate; defaults to 0
  * @return    the y-value of the PDF evaluated at `x`
  */
DiscreteUniformDistribution.prototype.evalCDF = function (x) {
  if      (x === -Infinity) return 0;
  else if (x ===  Infinity) return 1;
  x = (typeof x === 'number') ? x : 0;
  return this.evalPDF(0) * (x + 1);
}

/**
  * Returns the area under the PDF from `min` to `max`.
  * The area under the PDF can be interpreted as the probability of obtaining a datum
  * within the closed interval `[min, max]`.
  * @param `min` the lower bound of the input; defaults to 0
  * @param `max` the upper bound of the input; defaults to `this.outcomes - 1`
  * @return this.evalCDF(max) - this.evalCDF(min)
  */
DiscreteUniformDistribution.prototype.area = function (min, max) {
  min = (typeof min === 'number') ? min : 0;
  max = (typeof max === 'number') ? max : this.outcomes - 1;
  return this.evalCDF(max) - this.evalCDF(min);
}

/** Returns the mean (statistical average) of this distribution. */
DiscreteUniformDistribution.prototype.getMean = function () {
  return (this.outcomes - 1) / 2; // (1 / this.outcomes) * Util.triangular(this.outcomes - 1);
}

/** Returns the standard deviation (statistical spread) of this distribution. */
DiscreteUniformDistribution.prototype.getStdev = function () {
  var sum = 0;
  for (var i = 0; i < this.outcomes; i++) {
    sum += Math.pow(i - this.getMean(), 2);
  }
  return this.evalPDF(i) * sum;
}
