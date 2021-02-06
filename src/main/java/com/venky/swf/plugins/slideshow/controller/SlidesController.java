package com.venky.swf.plugins.slideshow.controller;

import com.venky.swf.controller.annotations.RequireLogin;
import com.venky.swf.db.Database;
import com.venky.swf.db.annotations.column.ui.mimes.MimeType;
import com.venky.swf.path.Path;
import com.venky.swf.plugins.slideshow.db.model.Attachment;
import com.venky.swf.plugins.slideshow.db.model.Slide;
import com.venky.swf.plugins.templates.controller.TemplatedModelController;
import com.venky.swf.views.BytesView;
import com.venky.swf.views.View;

import java.util.List;

public class SlidesController extends TemplatedModelController<Slide> {
    public SlidesController(Path path) {
        super(path);
    }
    @RequireLogin(false)
    public View attachment(long id){
        Slide slide = Database.getTable(Slide.class).get(id);
        if (slide != null){
            List<Attachment> attachmentList = slide.getAttachments();
            if (!attachmentList.isEmpty()){
                return view(attachmentList.get(0),null);
            }
        }
        return new BytesView(getPath(),"".getBytes(), MimeType.TEXT_PLAIN);
    }



    @Override
    @RequireLogin(false)
    public View index() {
        return super.index();
    }

    @Override
    @RequireLogin(false)
    public View search() {
        return super.search();
    }
}
