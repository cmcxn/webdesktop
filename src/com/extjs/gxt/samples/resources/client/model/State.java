/*
 * Ext GWT 2.2.5 - Ext for GWT
 * Copyright(c) 2007-2010, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.extjs.gxt.samples.resources.client.model;

import com.extjs.gxt.ui.client.data.BaseModelData;

public class State extends BaseModelData {

  public State() {

  }

  public State(String abbr, String name, String slogan) {
    setAbbr(abbr);
    setName(name);
    setSlogan(slogan);
  }

  public String getSlogan() {
    return get("slogan");
  }

  public void setSlogan(String slogan) {
    set("slogan", slogan);
  }

  public String getAbbr() {
    return get("abbr");
  }

  public void setAbbr(String abbr) {
    set("abbr", abbr);
  }

  public String getName() {
    return get("name");
  }

  public void setName(String name) {
    set("name", name);
  }

}
