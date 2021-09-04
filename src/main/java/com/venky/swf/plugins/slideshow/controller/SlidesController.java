package com.venky.swf.plugins.slideshow.controller;

import com.venky.swf.controller.annotations.RequireLogin;
import com.venky.swf.path.Path;
import com.venky.swf.plugins.slideshow.db.model.Slide;
import com.venky.swf.controller.ModelController;
import com.venky.swf.views.View;

public class SlidesController extends ModelController<Slide> {
    public SlidesController(Path path) {
        super(path);
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
