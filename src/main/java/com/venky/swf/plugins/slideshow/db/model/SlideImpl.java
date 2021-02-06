package com.venky.swf.plugins.slideshow.db.model;

import com.venky.swf.db.table.ModelImpl;

import java.util.List;

public class SlideImpl extends ModelImpl<Slide> {
    public SlideImpl(Slide slide){
        super(slide);
    }
    public SlideImpl(){
        super();
    }
    public String getAttachmentUrl() {
        Slide slide = getProxy();
        if (slide.getRawRecord().isNewRecord()){
            return null;
        }else {
            List<Attachment> attachmentList = slide.getAttachments();
            if (attachmentList.isEmpty()){
                return null;
            }
            return "/slides/attachment/" + slide.getId();
        }
    }
}
