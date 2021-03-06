package org.keycloak.testsuite.performance.metrics.impl;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.keycloak.testsuite.performance.metrics.Metric;

/**
 *
 * @author tkyjovsk
 */
public class Result implements Metric {

    private final long count;
    private final long min;
    private final long max;
    private final double average;
    private final double standardDeviation;

    public Result(long count, long min, long max, double average, double standardDeviation) {
        this.count = count;
        this.min = min;
        this.max = max;
        this.average = average;
        this.standardDeviation = standardDeviation;
    }

    public Result(Metric metric) {
        this(
                metric.getCount(),
                metric.getMin(),
                metric.getMax(),
                metric.getAverage(),
                metric.getStandardDeviation());
    }

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public long getMin() {
        return min;
    }

    @Override
    public long getMax() {
        return max;
    }

    @Override
    public double getAverage() {
        return average;
    }

    @Override
    public double getStandardDeviation() {
        return standardDeviation;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String toLogString() {
        return count + " " + min + " " + max + " " + average + " " + standardDeviation;
    }

}
