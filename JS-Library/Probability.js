function Probability() {
}

/**
  * Selects a uniformly distributed random rational number within the interval [0,1).
  * @return a random decimal within the interval [0, 1)
  */
// Math.rand();

/**
  * Computes the factorial of the given non-negative integer parameter.
  * The factorial of a positive integer is the product of all the positive integers less than
  * or equal to that integer. The factorial of 0 is defined to be 1. The factorial of a negative
  * number is undefined (this method will return 0).
  * @param `integer` a positive integer
  * @return          the product of all the positive integers less than or equal to the parameter
  */
Probability.factorial(integer) {
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
Probability.factorialRecursive(integer) {
  var product = 1;
  if (integer > 0) product = integer * Probability.factorial(integer - 1);
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
Probability.triangular(integer) {
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
Probability.triangularRecursive(integer) {
  var sum = 1;
  if (integer > 0) sum = integer + Probability.triangular(integer - 1);
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
Probability.permute(n, r) {
  var numerator = 0;
  var denominator = 1;
  if (n >= r && r >= 1) {
    numerator   = Probability.factorial(n);
    denominator = Probability.factorial(n - r);
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
Probability.combine(n, r) {
    int numerator   = Probability.permute(n, r);
    int denominator = Probability.factorial(r);
    return num / den;
    // The ratio will always be an integer because permute(n, r) will always be an integer multiple of factorial(r).
}
