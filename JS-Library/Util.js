function Util() {
}

/**
  * Computes the factorial of the given non-negative integer parameter.
  * The factorial of a positive integer is the product of all the positive integers less than
  * or equal to that integer. The factorial of 0 is defined to be 1. The factorial of a negative
  * number is undefined (this method will return 0).
  * @param `integer` a positive integer
  * @return          the product of all the positive integers less than or equal to the parameter
  */
Util.factorial(integer) {
  var product = 1;
  if (integer > 0) {
    for (var i = 1; i <= integer; i++) {
      product *= i;
    }
  }
  else if (integer == 0) product = 1;
  else product = 0;
  return product;
}
Util.factorialRecursive(integer) {
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
Util.triangular(integer) {
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
Util.triangularRecursive(integer) {
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
Util.permute(n, r) {
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
Util.combine(n, r) {
    int numerator   = Util.permute(n, r);
    int denominator = Util.factorial(r);
    return num / den;
    // The ratio will always be an integer because permute(n, r) will always be an integer multiple of factorial(r).
}

/**
  * Selects a uniformly distributed random non-negative decimal less than the given parameter.
  * @param `number` a positive decimal, the exclusive least upper bound of the interval
  * @return       a randomly selected decimal within [0, number)
  */
Util.randTo(number) {
  return Math.rand() * number;
}

/**
  * Selects a uniformly distributed random non-negative integer less than the given parameter.
  * @param number a positive integer, the exclusive least upper bound of the interval
  * @return       a randomly selected integer within [0, number)
  */
Util.randToInt(number) {
  return Math.floor(randTo(number));
}

/**
  * Selects a uniformly distributed random non-negative decimal between the two given parameters.
  * @param `low`    a positive decimal, the minimum of the interval
  * @param `high`   a positive decimal, the exclusive least upper bound of the interval
  * @return         a randomly selected nonnegative decimal within [low, high)
  */
Util.randBetween(low, high) {
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
Util.randBoolean(p) {
  if (p == null) p = 0.5;
  return (Math.rand() < p);
}
