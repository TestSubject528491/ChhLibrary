/**
  * Creates a general discrete probability distribution with a given number of outcomes.
  * Assumes the domain is the closed interval [0, outcomes - 1].
  * For example, if `outcomes = 6`, then the inputs consist of {0, 1, 2, 3, 4, 5}.
  * @param `outcomes` the number of total outcomes; defaults to 1
  */
function DiscreteDistribution(outcomes) {
  this.outcomes = (outcomes > 0) ? outcomes : 1;
}

/**
  * Returns the output of the probability density function of this distribution.
  * This value is the probability of obtaining any one outcome.
  * @param `x` the input of the PDF to evaluate; defaults to 0
  * @return    the y-value of the PDF evaluated at `x`
  */
DiscreteDistribution.prototype.evalPDF = function (x) {
  if (x === -Infinity || x === Infinity) return 0;
  x = (x === undefined) ? 0 : x;
}

/**
  * Returns the cumulative distribution function of this distribution.
  * The CDF is the integral of the PDF. It can be statistically interpreted as the probability
  * of obtaining an outcome less than or equal to the input.
  * @param `x` the input of the CDF to evaluate; defaults to 0
  * @return    the y-value of the PDF evaluated at `x`
  */
DiscreteDistribution.prototype.evalCDF = function (x) {
  if      (x === -Infinity) return 0;
  else if (x ===  Infinity) return 1;
  x = (typeof x === 'number') ? x : 0;
  var sum = 0;
  for (var i = 0; i <= x; i++) {
    sum += this.evalPDF(i);
  }
  return sum;
}

/**
  * Returns the area under the PDF from `min` to `max`.
  * The area under the PDF can be interpreted as the probability of obtaining a datum
  * within the closed interval `[min, max]`.
  * @param `min` the lower bound of the input; defaults to 0
  * @param `max` the upper bound of the input; defaults to `this.outcomes - 1`
  * @return this.evalCDF(max) - this.evalCDF(min)
  */
DiscreteDistribution.prototype.area = function (min, max) {
  min = (typeof min === 'number') ? min : 0;
  max = (typeof max === 'number') ? max : this.outcomes - 1;
  return this.evalCDF(max) - this.evalCDF(min);
}

/** Returns the mean (statistical average) of this distribution. */
DiscreteDistribution.prototype.getMean = function () {
  var sum = 0;
  for (var i = 0; i < this.outcomes; i++) {
    sum += i * this.evalPDF(i);
  }
  return sum;
}

/** Returns the standard deviation (statistical spread) of this distribution. */
DiscreteDistribution.prototype.getStdev = function () {
  var sum = 0;
  for (var i = 0; i < this.outcomes; i++) {
    sum += Math.pow(i - this.getMean(), 2) * this.evalPDF(i);
  }
  return sum;
}
