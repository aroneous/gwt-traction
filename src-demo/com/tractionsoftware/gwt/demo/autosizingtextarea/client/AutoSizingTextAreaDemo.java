/*
 * Copyright 2010 Traction Software, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.tractionsoftware.gwt.demo.autosizingtextarea.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.tractionsoftware.gwt.user.client.ui.AutoSizingTextArea;
import com.tractionsoftware.gwt.user.client.ui.TextAreaWithSelection;

public class AutoSizingTextAreaDemo implements EntryPoint {

    @Override
    public void onModuleLoad() {

        AutoSizingTextArea small = new AutoSizingTextArea(new TextAreaWithSelection(), 50, 600);
        small.addStyleName("small");
        RootPanel.get("small").add(small);

        AutoSizingTextArea large = new AutoSizingTextArea(new TextAreaWithSelection(), 50, 600);
        large.addStyleName("large");
        RootPanel.get("large").add(large);
        
    }
}
