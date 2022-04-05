package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        // Read access always
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Write access only after their trial period of 6 months, 
        // ie. the employmentDate is more than 6 months ago.
        LocalDate sixMonthAgo = LocalDate.now().minusMonths(6);

        if (employmentDate.isBefore(sixMonthAgo)) return true;
        else return false;
    }
}
