package com.example.newkrepysh.di.uicomponents;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import kotlin.annotation.AnnotationRetention;

@Scope
@Retention(RUNTIME)
public @interface PerFragment {
}
