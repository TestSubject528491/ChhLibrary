function Util() {
}

Util.PHI = (1 + Math.sqrt(5)) / 2;
Util.PSI = (1 - Math.sqrt(5)) / 2;
Util.PHI_INV = 1 / Util.PHI;
Util.TAU = 2 * Math.PI;


/**
  * Returns the number closest to the given parameter within the closed interval [lower, upper].
  * If the parameter is in the interval, the method returns the number. If the parameter is outside,
  * the method returns the closest bound (either upper or lower).
  * If lower >= upper, then this method will return NaN.
  * This method is NON-DESTRUCTIVE: it does not change the value of the given parameter.
  * @param x the number to be tested
  * @param lower the lower bound, inclusive
  * @param upper the upper bound, inclusive. Must be >= `lower`.
  * @return      the closest number to `x` within the interval [lower, upper]
  */
Util.bound = function (x, lower, upper) {
  if      (x < lower) return lower;
  else if (x > upper) return upper;
  else                return x;
}

/**
  * Returns whether a given integer is prime.
  * An integer is mathematically prime if and only if its only positive integer divisors are itself and 1.
  * @param integer the given integer
  * @return        `true` if `integer` is prime
  */
Util.isPrime = function (integer) {
  var returned = true;
  if (integer <= 1) returned = false;
  else {
    for (var i = 2; i <= Math.sqrt(integer); i++) {
      if (integer % i == 0) returned = returned && false;
    }
  }
  return returned;
}

/**
  * Computes the factorial of a given non-negative integer.
  * The factorial of a positive integer `n`, written in mathematical notation as `n!`, is the product
  * of all the positive integers less than or equal to `n`.
  * The factorial of 0 is defined to be 1. The factorial of a negative number is undefined
  * (in that case this method will return NaN).
  * The recursive form of this function defines `n! { return n * (n-1)! }`
  * @param `integer` a non-negative integer
  * @return          the product of all the positive integers less than or equal to the parameter
  */
Util.factorial = function (integer) {
  var product = 1;
  if (integer > 0) {
    for (var i = integer; i > 0; i--) {
      product *= i;
    }
  }
  else if (integer === 0) product = 1;
  else product = NaN;
  return product;
}
Util.factorialRecursive = function (integer) {
  var product = 1;
  if (integer > 0) product = integer * Util.factorialRecursive(integer - 1);
  else if (integer === 0) product = 1;
  else product = NaN;
  return product;
}

/**
  * Computes the double-factorial of a given non-negative integer.
  * The double-factorial of `n`, written in mathematical notation as `n!!`, is *not* the factorial
  * of `n!`, but rather the product of every *other* positive integer leading up to `n`.
  * For example, `7!! == 7 * 5 * 3 * 1` and `6!! == 6 * 4 * 2`
  * The double-factorial of 0 is defined to be 1. The double-factorial of a negative number is
  * undefined (in that case this method will return NaN).
  * The recursive form of this function defines `n!! { return n! / (n-1)!! }`
  * @param `integer` a positive integer
  * @return          the product of every other positive integer less than or equal to the parameter
  */
Util.doubleFactorial = function (integer) {
  var product = 1;
  if (integer > 0) {
    for (var i = integer; i > 0; i--) {
      product *= i;
      i--; // again
    }
  }
  else if (integer === 0) product = 1;
  else product = NaN;
  return product;
}
Util.doubleFactorialRecursive = function (integer) {
  var product = 1;
  if (integer > 0) product = Util.factorial(integer) / Util.doubleFactorialRecursive(integer - 1);
  else if (integer === 0) product = 1;
  else product = NaN;
  return product;
}

/**
  * Computes the triangular number of the given non-negative integer parameter.
  * The triangular of a non-negative integer is the sum of all the non-negative integers less than
  * or equal to that integer. The triangular of a negative number is undefined (this method will return NaN).
  * @param `integer` a positive integer
  * @return          the sum of all the non-negative integers less than or equal to the parameter
  */
Util.triangular = function (integer) {
  var sum = 0;
  if (integer > 0) {
    for (var i = 1; i <= integer; i++) {
      sum += i;
    }
  }
  else if (integer == 0) sum += 0;
  else sum = NaN;
  return sum;
}
Util.triangularRecursive = function (integer) {
  var sum = 0;
  if (integer > 0) sum = integer + Util.triangular(integer - 1);
  else if (integer == 0) sum += 0;
  else sum = NaN;
  return sum;
}

/**
  * Returns the `n`th term of the Fibonacci sequence, where `n` is a parameter.
  * A Fibonacci sequence is constructed with the first two terms specified, and each subsequent
  * term in the sequence is the sum of the previous two terms. The "smallest" Fibonacci sequence
  * starts with 1, 1, 2, 3, 5, 8, ... and this function returns a term in that sequence.
  * @param `n` the position of the term returned. must be an integer
  * @return    the `n`th term of the sequence
  */
Util.fibonacci = function (n) {
  n++;
  return (1 / Math.sqrt(5)) * (Math.pow(Util.PHI, n) - Math.pow(Util.PSI, n));
}
Util.fibonacciRecursive = function (n) {
  if (n === 0 || n === 1) return 1;
  else if (n > 1)         return (Util.fibonacci(n-1) + Util.fibonacci(n-2));
  else return NaN;
}

/**
  * Calculates the number of permutations of n objects taken r at a time.
  * @param n the number of total objects
  * @param r the number of objects taken at a time; must be <= `n`
  * @return  the number of permutations of `n` objects taken `r` at a time
  */
Util.permute = function (n, r) {
  var numerator = 0;
  var denominator = 1;
  if (1 <= r && r <= n) {
    numerator   = Util.factorial(n);
    denominator = Util.factorial(n - r);
  }
  return numerator / denominator;
  // The ratio will always be an integer because factorial(n) will always be an integer multiple of factorial(n-r).
}

/**
  * Calculates the number of combinations of n objects taken r at a time.
  * @param n the number of total objects
  * @param r the number of objects taken at a time; must be <= `n`
  * @return  the number of combinations of `n` objects taken `r` at a time
  */
Util.combine = function (n, r) {
    var numerator   = Util.permute(n, r);
    var denominator = Util.factorial(r);
    return num / den;
    // The ratio will always be an integer because permute(n, r) will always be an integer multiple of factorial(r).
}

/**
  * Selects a uniformly distributed random decimal within the interval [0, 1).
  * @return Math.random();
  */
Util.rand = Math.random; // = function () { return Math.random(); }

/**
  * Selects a uniformly distributed random non-negative decimal less than the given parameter.
  * @param `number` a positive decimal, the exclusive least upper bound of the interval
  * @return       a randomly selected decimal within [0, number)
  */
Util.randTo = function (number) {
  return Math.random() * number;
}

/**
  * Selects a uniformly distributed random non-negative integer less than the given parameter.
  * @param integer a positive integer, the exclusive least upper bound of the interval
  * @return        a randomly selected integer within [0, integer)
  */
Util.randToInt = function (integer) {
  return Math.floor(Util.randTo(number));
}

/**
  * Selects a uniformly distributed random non-negative decimal between the two given parameters.
  * @param `low`    a positive decimal, the minimum of the interval
  * @param `high`   a positive decimal, the exclusive least upper bound of the interval
  * @return         a randomly selected nonnegative decimal within [low, high)
  */
Util.randBetween = function (low, high) {
  return Util.randTo(high - low) + low;
}

/**
  * Selects a Boolean value with a probability `p` of being `true`.
  * `p` must be within the interval (0.0, 1.0) to have any
  * random significance.
  * If `p <= 0` then this method will return `false`,
  * and if `p >= 1` then this method will return `true`.
  * If `p` is not given, it defaults to 0.5 (even probability).
  * @param `p` the probability that this method will return `true`
  * @return    `true` if a randomly selected number between 0 and 1 is less than `p`
  */
Util.randBoolean = function (p) {
  p = (p === undefined) ? 0.5 : p;
  return (Math.random() < p);
}

/**
  * Selects a Gaussian-distributed random decimal with given mean and standard deviation
  * (a normal distribution).
  * If parameters are not specified, mean = 0 and standard deviation = 1
  * (the standard normal distribution).
  * Note that the range of the output is technically (-infinity, infinity), however
  * the following probabilities hold (where m = mean and s = stdev):
  * - the output will be within (-1s + m, 1s + m) or (-1, 1): about 68.27%
  * - the output will be within (-2s + m, 2s + m) or (-2, 2): about 95.45%
  * - the output will be within (-3s + m, 3s + m) or (-3, 3): about 99.73%
  * This method uses
  * [the polar form of the Box-Muller Transformation](http://en.wikipedia.org/wiki/Box-Muller_transform).
  * @param `mean`  the statistical center of all the outputs
  * @param `stdev` the statistical spread of all the outputs
  * @return        a normally-distributed decimal.
  */
Util.randGaussian = function(mean, stdev) {
  mean  = (mean  === undefined) ? 0 : mean;
  stdev = (stdev === undefined) ? 1 : stdev;
  var x, y;
  var s = 0;
  do {
    x = Util.randBetween(-1, 1);
    y = Util.randBetween(-1, 1);
    s = x*x + y*y;
  } while (s <= 0 || 1 <= s); // s must be in the open interval (0,1).
  /*
  m = sqrt( ln( 1/s^2 ) / s )
    = sqrt( -ln(s^2)    / s )
    = sqrt( -2ln(s)     / s )
  */
  // var m = Math.sqrt(Math.log(1/(s * s)) / s);
  var m = Math.sqrt(-2 * Math.log(s) / s);
  x *= m;
  y *= m;
  var stnormal = (Util.randBoolean()) ? x : y; // returns either x or y, chosen randomly
  return stnormal * stdev + mean; // transforms from standard normal to adjusted mean and stdev
}

function uniformTest(times, min, max) {
  var successes = 0;
  var  failures = 0;
  for (var i = 0; i < times && times <= 10000; i++) {
    var x = Util.rand();
    if      (min <= x && x <= max) successes++;
    else if (x < min  ||  max < x)  failures++;
  }
  console.log('successes: ' + successes);
  console.log('failures:  ' +  failures);
  console.log('random sample: ' + x);
}

function normalTest(times, min, max, mean, stdev) {
  mean  = (mean  === undefined) ? 0 : mean;
  stdev = (stdev === undefined) ? 1 : stdev;
  var successes = 0;
  var  failures = 0;
  for (var i = 0; i < times && times <= 10000; i++) {
    var x = Util.randGaussian(mean, stdev);
    if      (min <= x && x <= max) successes++;
    else if (x < min  ||  max < x)  failures++;
  }
  console.log('successes: ' + successes);
  console.log('failures:  ' +  failures);
  console.log('random sample: ' + x);
}

function factorialtest(times) {
  for (i = 0; i <= times; i++) {
    console.log(i + '! = ' + Util.factorial(i) + ' or ' + Util.factorialRecursive(i));
  }
}

function doublefactorialtest(times) {
  for (i = 0; i <= times; i++) {
    console.log(i + '!! = ' + Util.doubleFactorial(i) + ' or ' + Util.doubleFactorialRecursive(i));
  }
}
