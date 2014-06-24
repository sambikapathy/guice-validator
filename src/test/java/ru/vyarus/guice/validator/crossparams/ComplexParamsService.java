package ru.vyarus.guice.validator.crossparams;

import javax.inject.Singleton;
import javax.validation.executable.ValidateOnExecution;

/**
 * Service with method cross parameters validation.
 *
 * @author Vyacheslav Rusakov
 * @since 24.06.2014
 */
@Singleton
@ValidateOnExecution
public class ComplexParamsService {

    @CrossParamsCheck
    public void action(Integer param1, Object param2) {

    }
}
