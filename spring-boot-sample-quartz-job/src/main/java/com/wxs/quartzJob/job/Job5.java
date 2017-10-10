package com.wxs.quartzJob.job;

import com.wxs.quartzJob.core.JobAware;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * <p>Job5</p>
 *
 * @author wuxinshui
 */
@Component
public class Job5 implements JobAware {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("This is test for Job5");
    }
}
