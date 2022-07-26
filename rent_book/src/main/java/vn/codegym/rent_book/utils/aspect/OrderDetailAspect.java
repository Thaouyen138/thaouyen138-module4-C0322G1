package vn.codegym.rent_book.utils.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderDetailAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @After("execution(* vn.codegym.rent_book.controller.BookController.*(..))")
    public void logAfterMethodContronller(JoinPoint joinPoint){
        String nameMethod = joinPoint.getSignature().getName();
        logger.info("Tên phương thức: " + nameMethod);
    }
}
