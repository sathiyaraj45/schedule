package com.sathiya.schedule.config;

import ch.qos.logback.core.util.FixedDelay;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.sql.SQLOutput;

/**
 * @Author Sathiyaraj created on 09-02-2022
 * <p>
 * TODO
 */

@Configuration
@EnableScheduling
public class FixedRateSchedule {
    @Scheduled(fixedRate = 1000, initialDelay = 20000)
    public void fixedRateDelayTask() {
        System.out.println("Fixed rate delay to run the application");
    }

    @Scheduled(fixedDelayString = "${delayMillSecond}")
    public void fixedDelayTask() {
        System.out.println("Fixed delay to run the application");
    }

    @Scheduled(cron = "0 * * * * *")
    public void cronTask() {
        System.out.println("Cron job started");
    }
}
