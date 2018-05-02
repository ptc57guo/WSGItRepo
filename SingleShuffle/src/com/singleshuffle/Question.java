package com.singleshuffle;

public abstract class Question {

    /** Override this to set the debug log tag name. There may also be other uses in the future. */
    protected abstract String getQuestionName();

    public abstract void solve();

    /** Prints message prepended with question name as a tag. */
    protected void log(String message) {
        System.out.println(getQuestionName() + "Question. " + message);
    }

}
