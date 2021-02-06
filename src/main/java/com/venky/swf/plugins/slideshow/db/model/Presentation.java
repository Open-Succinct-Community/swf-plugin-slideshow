package com.venky.swf.plugins.slideshow.db.model;

import com.venky.swf.db.annotations.model.HAS_DESCRIPTION_FIELD;
import com.venky.swf.db.model.Model;

import java.util.List;
@HAS_DESCRIPTION_FIELD
public interface Presentation extends Model {
    public String getName();
    public void setName(String name);

    public List<Slide> getSlides();
}
