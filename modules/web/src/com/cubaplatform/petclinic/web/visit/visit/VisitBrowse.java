package com.cubaplatform.petclinic.web.visit.visit;

import com.cubaplatform.petclinic.entity.visit.Visit;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.screen.StandardLookup;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

@UiController("petclinic_Visit.browse")
@UiDescriptor("visit-browse.xml")
@LookupComponent("visitsTable")
public class VisitBrowse extends StandardLookup<Visit> {
  public void createForPet() {
    openWindow("create-visit-for-pet", WindowManager.OpenType.DIALOG);
  }
}