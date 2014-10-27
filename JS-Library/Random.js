function Random() {
}

/**
  * Selects a uniformly distributed random rational number within the interval [0,1).
  * @return a random decimal within the interval [0, 1)
  */
// Math.rand();

/**
  * Selects a uniformly distributed random non-negative decimal less than the given parameter.
  * @param `number` a positive decimal, the exclusive least upper bound of the interval
  * @return       a randomly selected decimal within [0, number)
  */
Random.randTo(number) {
  return Math.rand() * number;
}

/**
  * Selects a uniformly distributed random non-negative integer less than the given parameter.
  * @param number a positive integer, the exclusive least upper bound of the interval
  * @return       a randomly selected integer within [0, number)
  */
Random.randToInt(number) {
  return Math.floor(randTo(number));
}

/**
  * Selects a uniformly distributed random non-negative decimal between the two given parameters.
  * @param `low`    a positive decimal, the minimum of the interval
  * @param `high`   a positive decimal, the exclusive least upper bound of the interval
  * @return         a randomly selected nonnegative decimal within [low, high)
  */
Random.randBetween(low, high) {
  return Random.randTo(high - low) + low;
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
Random.randBoolean(p) {
  if (p == null) p = 0.5;
  return (Math.rand() < p);
}
