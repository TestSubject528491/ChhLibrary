function Util() {
}


/**
  * Returns the number closest to the given parameter within a specified closed interval [lower, upper].
  * If the parameter is in the interval, the method returns the number. If the parameter is outside,
  * the method returns the closest bound (either upper or lower).
  * If lower >= upper, then this method will return NaN.
  * This method is NON-DESTRUCTIVE: it does not change the value of the given parameter.
  * @param x the number to be tested
  * @param lower the lower bound, inclusive
  * @param upper the upper bound, inclusive. Must be >= `lower`.
  * @return the closest number to `x` within the interval [lower, upper]
  */
Util.bound = function (x, lower, upper) {
  var returned = x;
  if (lower <= upper) {
    if      (x < lower) returned = lower;
    else if (x > upper) returned = upper;
  } else returned = NaN;
  return returned;
}

/**
  * Returns whether a given integer is prime.
  * An integer is mathematically prime if and only if its only positive integer divisors are itself and 1.
  * @param integer the given integer
  * @return `true` if `integer` is prime
  */
Util.isPrime = function (integer) {
  var returned = true;
  if (integer <= 1) returned = false;
  else {
    for (var i = 2; i < integer; i++) {
      if (integer % i == 0) returned = false;
    }
  }
  return returned;
}




/**
  * Computes the factorial of the given non-negative integer parameter.
  * The factorial of a positive integer is the product of all the positive integers less than
  * or equal to that integer. The factorial of 0 is defined to be 1. The factorial of a negative
  * number is undefined (this method will return NaN).
  * @param `integer` a positive integer
  * @return          the product of all the positive integers less than or equal to the parameter
  */
Util.factorial = function (integer) {
  var product = 1;
  if (integer > 0) {
    for (var i = 1; i <= integer; i++) {
      product *= i;
    }
  }
  else if (integer == 0) product = 1;
  else product = NaN;
  return product;
}
Util.factorialRecursive = function (integer) {
  var product = 1;
  if (integer > 0) product = integer * Util.factorial(integer - 1);
  else if (integer == 0) product = 1;
  else product = 0;
  return product;
}

/**
  * Computes the triangular number of the given non-negative integer parameter.
  * The triangular of a non-negative integer is the sum of all the non-negative integers less than
  * or equal to that integer. The triangular of a negative number is undefined (this method will return -1).
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
  else if (integer == 0) sum = 0;
  else sum = -1;
  return sum;
}
Util.triangularRecursive = function (integer) {
  var sum = 1;
  if (integer > 0) sum = integer + Util.triangular(integer - 1);
  else if (integer == 0) sum = 0;
  else sum = -1;
  return sum;
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
  if (n >= r && r >= 1) {
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
  * Selects a uniformly distributed random non-negative decimal less than the given parameter.
  * @param `number` a positive decimal, the exclusive least upper bound of the interval
  * @return       a randomly selected decimal within [0, number)
  */
Util.randTo = function (number) {
  return Math.random() * number;
}

/**
  * Selects a uniformly distributed random non-negative integer less than the given parameter.
  * @param number a positive integer, the exclusive least upper bound of the interval
  * @return       a randomly selected integer within [0, number)
  */
Util.randToInt = function (number) {
  return Math.floor(randTo(number));
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
  if (p === undefined) p = 0.5;
  return (Math.random() < p);
}
