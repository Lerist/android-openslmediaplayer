/*
 *    Copyright (C) 2014 Haruki Hasegawa
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */


package com.h6ah4i.android.example.openslmediaplayer.app;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.h6ah4i.android.example.openslmediaplayer.app.framework.AppEventBus;
import com.h6ah4i.android.example.openslmediaplayer.app.model.GlobalAppController;

public class AppBaseFragment extends Fragment {

    protected ActionBar getActionBar() {
        return ((AppCompatActivity) getActivity()).getSupportActionBar();
    }

    protected boolean isNavigationDrawerOpen() {
        return ((MainActivity) getActivity()).isNavigationDrawerOpen();
    }

    protected GlobalAppController getAppController() {
        return ((MainActivity) getActivity()).getAppController();
    }

    protected AppEventBus eventBus() {
        return ((MainActivity) getActivity()).eventBus();
    }
}
