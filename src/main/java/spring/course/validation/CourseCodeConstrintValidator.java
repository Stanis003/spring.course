package spring.course.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstrintValidator
        implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode theCoursePrefix) {
        coursePrefix = theCoursePrefix.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        } else {
            result = true;
        }


        return result;
    }
}
