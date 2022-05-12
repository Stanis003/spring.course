package spring.course.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstrintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String value() default "LUV";

    //define default course code
    public String message() default "must start with LUV";

    //define default error message
    public Class<?>[] groups() default {};

    //define default groups
    public Class<? extends Payload>[] payload() default {};
    //define default payloads


}
