package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        // Read access always
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Write access to Resources if they are certified,
        // ie. the lastCertified date is less than one year ago.
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        
        if (lastCertified.isAfter(oneYearAgo)) return true;
        else return false;
    }
}
