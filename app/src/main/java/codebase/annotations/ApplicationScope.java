package dagger2.codebase.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by kietnh on 12/12/16.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationScope {
}
