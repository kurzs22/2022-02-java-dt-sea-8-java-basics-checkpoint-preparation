package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        //  level 0 is no access, level 1 is Read access, level 2 is Write access.
        if (level > 0) return true;
        else return false;
    }

    @Override
    public boolean hasWriteAccess() {
        //  level 0 is no access, level 1 is Read access, level 2 is Write access.
        if (level > 1) return true;
        else return false;
    }
}
