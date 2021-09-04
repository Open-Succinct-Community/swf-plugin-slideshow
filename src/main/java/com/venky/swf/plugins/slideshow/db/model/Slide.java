package com.venky.swf.plugins.slideshow.db.model;

import com.venky.swf.db.annotations.column.COLUMN_SIZE;
import com.venky.swf.db.annotations.column.IS_NULLABLE;
import com.venky.swf.db.annotations.column.IS_VIRTUAL;
import com.venky.swf.db.annotations.column.indexing.Index;
import com.venky.swf.db.annotations.model.ORDER_BY;
import com.venky.swf.db.model.Model;

import java.util.List;

@ORDER_BY("PRESENTATION_ID,SEQUENCE,ID")
public interface Slide extends Model {
    @IS_NULLABLE(false)
    @Index
    public long getPresentationId();
    public void setPresentationId(long id);
    public Presentation getPresentation();

    @Index
    public int getSequence();
    public void setSequence(int sequence);

    @COLUMN_SIZE(2048)
    @Index
    public String getText();
    public void setText(String text);

    @Index
    public String getTags();
    public void setTags(String tags);

    @IS_VIRTUAL
    public String getAttachmentUrl();

    public List<Attachment> getAttachments();
}
