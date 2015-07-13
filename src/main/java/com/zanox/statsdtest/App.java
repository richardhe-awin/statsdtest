package com.zanox.statsdtest;

import com.timgroup.statsd.NonBlockingStatsDClient;
import com.timgroup.statsd.StatsDClient;

/**
 * Hello world!
 */
public class App {

    public static final void main(String[] args) {
        String host;
        if (args.length == 0) {
            host = "s-graph-01.zanox.com";
        } else {
            host = args[0];
        }
        StatsDClient statsd = new NonBlockingStatsDClient("hadooptest", host, 8125);
        statsd.incrementCounter("bar");
    }
}
