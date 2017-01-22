###--- Logging ---
######Created by dsztanko

This repo was made to show you a possible way of how to get rid of the system log messages and see the point.

If you don't like using logging (studied during overcomplicated-tac-toe week) because you find it quite difficult to find your personal messages in the console, this is my solution how to filter your owns.

####Instructions:

1. Import the codebase as a Maven project.
2. Run Server.java.
As you can see it has a simple Server class which runs on port 60000.
3. Make some requests. Call 'localhost:60000' and localhost:60000/interaction' in your browser.
It has 2 routes. If they are requested, they print some relevant log messages into the console by default.
4. Check your console.
Log messages are already filtered, as you can see.

####Explanation:
Firstly, you need to import logback dependencies in your pom.xml. As you probably noticed, when I add a new log message, I concat a special string at the beginning of the row. This is my filter, I saved it into an enum called LogFormatter and use it as some kind of global variable. It is handled dynamically this way, because if someone doesn't like my '>>>>> '-s, then it can modified by changing only one row. Important to note, that every message of yours need to start with this string, because it represents your customized filter.

You can find in 'resources' a logback xml. It is the configuration file of this library. It has two <appenders>: one is responsible for controlling logging into console, the other one is responsible for writing messages into files. By default it creates a log folder (.gitignored) in the root directory and creates log files day by day.

In the \<appender> you can see this piece of code:

\<filter class="logging_sample.logging.SampleFilter"/>

This row communicates with the SampleFilter class. It does nothing more than prints out the messages which contains my customized string '>>>>> '.

And that's all how it works. Just simple as that.

######Thanks for reading, hope you've found some useful info here.


