package com.venky.swf.plugins.slideshow.controller;

import com.venky.swf.controller.annotations.RequireLogin;
import com.venky.swf.path.Path;
import com.venky.swf.plugins.slideshow.db.model.Presentation;
import com.venky.swf.plugins.templates.controller.TemplatedModelController;
import com.venky.swf.views.View;

public class PresentationsController  extends TemplatedModelController<Presentation> {
    public PresentationsController(Path path) {
        super(path);
    }

    @Override
    @RequireLogin(false)
    public View search() {
        return super.search();
    }

    @Override
    @RequireLogin(false)
    public View search(String strQuery) {
        return super.search(strQuery);
    }

    @Override
    @RequireLogin(false)
    public View index() {
        return super.index();
    }
}
