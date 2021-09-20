package com.epam.training.automation.tests.junit;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Providers {

  private Providers() {}

  public static Stream<Arguments> testGetSumLongNumbers() {
    return Stream.of(
        arguments(74586, 7265, 81851),
        arguments(4561, -32115, -27554),
        arguments(-134, 60, -74),
        arguments(0, 0, 0),
        arguments(-724, -10, -734),
        arguments(Long.MIN_VALUE, Long.MAX_VALUE, -1),
        arguments(0b1011010, 0b101111, 0b10001001),
        arguments(02452, 066666666, 066671340),
        arguments(0x7FFFL, 0x85ABL, 0x105AAL));
  }

  public static Stream<Arguments> testGetSubtractionLongNumbers() {
    return Stream.of(
        arguments(568, 508, 60),
        arguments(170, -880, 1050),
        arguments(-284, 5659, -5943),
        arguments(0, 0, 0),
        arguments(-31, -100, 69),
        arguments(Long.MIN_VALUE, Long.MIN_VALUE, 0),
        arguments(Long.MAX_VALUE, Long.MAX_VALUE, 0),
        arguments(0b11110100001, 0b0101000001, 1632),
        arguments(-3511, -04545210, 04536321),
        arguments(0xABC, -0x1982, 0x243E));
  }

  public static Stream<Arguments> testGetMultiplicationLongNumbers() {
    return Stream.of(
        arguments(4, 4, 16),
        arguments(100, -18, -1800),
        arguments(0, 0, 0),
        arguments(-17, -20, 340),
        arguments(Long.MIN_VALUE, 0, 0),
        arguments(Long.MAX_VALUE, 0, 0),
        arguments(Long.MIN_VALUE, 1, Long.MIN_VALUE),
        arguments(Long.MAX_VALUE, 1, Long.MAX_VALUE),
        arguments(
            0b101010101001010101000101010010101L,
            -0b010100110,
            -0b1101110100111001100101011101110010011110L),
        arguments(05, 503, 04723),
        arguments(-0xFFFFFL, 0x10BD, -0x10BCFEF43L));
  }

  public static Stream<Arguments> testGetDivisionLongNumbers() {
    return Stream.of(
        arguments(72, 12, 6),
        arguments(60, 1000, 0),
        arguments(-80, -10, 8),
        arguments(1506, 13, 115));
  }

  public static Stream<Arguments> testGetSumDoubleNumbers() {
    return Stream.of(
        arguments(1.0398, 35.66668547382, 36.70648547382),
        arguments(0.0, 0.0, 0.0),
        arguments(599.99, 0, 599.99),
        arguments(599.99, 0, 599.990000000000009),
        arguments(-1.7976931348623157E308, 1.7976931348623157E308, 0),
        arguments(-4.9E-324, 4.9E-324, 0),
        arguments(-5.983E3, 78E10, 779999994017d),
        arguments(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY),
        arguments(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN));
  }

  public static Stream<Arguments> testGetSubtractionDoubleNumbers() {
    return Stream.of(
        arguments(0.0, 0.0, 0),
        arguments(0, 599.99, -599.99),
        arguments(-98.9595834893, 117E-4, -989712834893E-10),
        arguments(-1.7976931348623157E308, -1.7976931348623157E308, 0),
        arguments(-4.9E-324, -4.9E-324, 0),
        arguments(0.0000, -4.9E-324d, 4.9E-324d),
        arguments(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN),
        arguments(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY));
  }

  public static Stream<Arguments> testGetMultiplicationDoubleNumbers() {
    return Stream.of(
        arguments(-12.0, -16.0, 192),
        arguments(18, 17.568, 316.224),
        arguments(10.0012, 56.18, 561.867416),
        arguments(10, 73.15, 731.5),
        arguments(0, 0.000, 0.0000000d),
        arguments(10E10, 584E-14, 0.584),
        arguments(4.9E-324, 1, 4.9E-324),
        arguments(-1.7976931348623157E308, -1, 1.7976931348623157E308),
        arguments(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY),
        arguments(Double.POSITIVE_INFINITY, 0, Double.NaN),
        arguments(Double.NEGATIVE_INFINITY, -1, Double.POSITIVE_INFINITY));
  }

  public static Stream<Arguments> testGetDivisionDoubleNumbers() {
    return Stream.of(
        arguments(10.14, 2.496, 4.0625),
        arguments(-10, 100, -0.1),
        arguments(35.895486702028571E192, 0, Double.POSITIVE_INFINITY),
        arguments(-1E-40, 0, Double.NEGATIVE_INFINITY),
        arguments(0, 0, Double.NaN),
        arguments(5, Double.POSITIVE_INFINITY, 0),
        arguments(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN));
  }

  public static Stream<Arguments> testGetRaisedToPowerDoubleNumbers() {
    return Stream.of(
        arguments(18.08E-5, 2, 3.268864E-8),
        arguments(8, 5.087, 3.9266190011250072484810212793677E4),
        arguments(45.78, 26.19, 3.1124250110044480578498660819491E43),
        arguments(-5.46, 0, 1),
        arguments(-56.0909, 1, -56.0909),
        arguments(0, 127E109, 0),
        arguments(0, 0, 1),
        arguments(0, -2.568, Double.POSITIVE_INFINITY),
        arguments(Double.MAX_VALUE, Double.MIN_VALUE, 1),
        arguments(Double.MIN_VALUE, Double.MAX_VALUE, 0),
        arguments(Double.POSITIVE_INFINITY, -1, 0));
  }

  public static Stream<Arguments> testGetSquareRootDoubleNumbers() {
    return Stream.of(
        arguments(256, 16),
        arguments(18.65955, 4.3196701262943678625604092669427),
        arguments(0, 0),
        arguments(-1, Double.NaN),
        arguments(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY),
        arguments(Double.NEGATIVE_INFINITY, Double.NaN));
  }

  public static Stream<Arguments> testGetSine() {
    return Stream.of(
        arguments(0, 0),
        arguments((Math.PI) / 6, 0.5),
        arguments((Math.PI) / 4, 0.7071067811865475),
        arguments((Math.PI) / 3, 0.8660254037844386),
        arguments((Math.PI) / 2, 1),
        arguments(Math.PI, 0),
        arguments(3 * (Math.PI) / 2, -1),
        arguments(58 * (Math.PI) / 180, 0.8480480961564260),
        arguments(Double.NaN, Double.NaN),
        arguments(Double.POSITIVE_INFINITY, Double.NaN),
        arguments(Double.NEGATIVE_INFINITY, Double.NaN));
  }

  public static Stream<Arguments> testGetCosine() {
    return Stream.of(
        arguments(0, 1),
        arguments((Math.PI) / 6, 0.8660254037844386),
        arguments((Math.PI) / 4, 0.7071067811865475),
        arguments((Math.PI) / 3, 0.5),
        arguments((Math.PI) / 2, 0),
        arguments(Math.PI, -1),
        arguments(Double.NaN, Double.NaN),
        arguments(Double.POSITIVE_INFINITY, Double.NaN),
        arguments(Double.NEGATIVE_INFINITY, Double.NaN));
  }

  public static Stream<Arguments> testGetTangent() {
    return Stream.of(
        arguments(0, 0),
        arguments(-0, -0),
        arguments((Math.PI) / 6, 0.57735026918962576450914878050196),
        arguments((Math.PI) / 4, 1),
        arguments((Math.PI) / 3, 1.7320508075688772935274463415059),
        arguments((Math.PI) / 2, Double.POSITIVE_INFINITY),
        arguments(Math.PI, 0),
        arguments(3 * (Math.PI) / 2, Double.NEGATIVE_INFINITY),
        arguments(Double.NaN, Double.NaN),
        arguments(Double.POSITIVE_INFINITY, Double.NaN),
        arguments(Double.NEGATIVE_INFINITY, Double.NaN));
  }

  public static Stream<Arguments> testGetCotangent() {
    return Stream.of(
        arguments(0, Double.POSITIVE_INFINITY),
        arguments((Math.PI) / 6, 1.7320508075688772935274463415059),
        arguments((Math.PI) / 4, 1),
        arguments((Math.PI) / 3, 0.57735026918962576450914878050196),
        arguments((Math.PI) / 2, 0),
        arguments(Math.PI, Double.NEGATIVE_INFINITY),
        arguments(3 * (Math.PI) / 2, 0),
        arguments(Double.NaN, Double.NaN),
        arguments(Double.POSITIVE_INFINITY, Double.NaN),
        arguments(Double.NEGATIVE_INFINITY, Double.NaN));
  }

  public static Stream<Arguments> testGetSignPositive() {
    return Stream.of(arguments(1827), arguments(Long.MAX_VALUE));
  }

  public static Stream<Arguments> testGetSignNegative() {
    return Stream.of(arguments(-785), arguments(Long.MIN_VALUE));
  }
}
