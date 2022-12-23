package com.exercise.project.exerciseproject.interfaces;

import com.exercise.project.exerciseproject.ztm.interfaces.MonarchyService;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MonarchyServiceTest {
    private final String JAKE = "Jake";
    private final String CAT = "Catherine";
    private final String JANE = "Jane";
    private final String FARAH = "Farah";
    private final String MARK = "Mark";
    private final String TOM = "Tom";
    private final String CEL = "Celine";
    private final String PET = "Peter";

    @Test
    void orderOfSuccession() {
        MonarchyService service = new MonarchyService(JAKE);
        service.birth(CAT, JAKE);
        service.birth(TOM, JAKE);
        service.birth(CEL, JAKE);
        service.birth(JANE, CAT);
        service.birth(FARAH, JANE);
        service.birth(MARK, CAT);
        service.birth(PET, CEL);

        assertEquals(List.of(JAKE, CAT, JANE, FARAH, MARK, TOM, CEL, PET), service.getOrderOfSuccession());
    }

    @Test
    void death() {
        MonarchyService service = new MonarchyService(JAKE);
        service.birth(CAT, JAKE);
        service.birth(TOM, JAKE);
        service.birth(CEL, JAKE);
        service.birth(JANE, CAT);
        service.birth(FARAH, JANE);
        service.birth(MARK, CAT);
        service.birth(PET, CEL);

        service.death(JAKE);
        service.death(JANE);
        assertEquals(List.of(CAT, FARAH, MARK, TOM, CEL, PET), service.getOrderOfSuccession());
    }

    @Test
    void birthParentNotFoundInMonarchy() {
        MonarchyService service = new MonarchyService(JAKE);
        assertThrows(NoSuchElementException.class, () -> service.birth(CAT, TOM));
    }

    @Test
    void deathLordNotFoundInMonarchy() {
        MonarchyService service = new MonarchyService(JAKE);
        assertThrows(NoSuchElementException.class, () -> service.death(TOM));
    }

}