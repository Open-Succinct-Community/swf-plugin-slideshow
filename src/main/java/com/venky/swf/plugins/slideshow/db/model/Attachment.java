package com.venky.swf.plugins.slideshow.db.model;

import com.venky.swf.db.annotations.column.UNIQUE_KEY;

public interface Attachment extends com.venky.swf.plugins.attachment.db.model.Attachment {
    @UNIQUE_KEY
    public Long getSlideId();
    public void setSlideId(Long id);
    public Slide getSlide();
}
