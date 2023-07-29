package com.pigsy;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.extension.ExtensionUnloadingHandler;
import com.pigsy.burp.MenuUtil;
import com.pigsy.ui.TerminalTabbedPane;
import com.pigsy.utils.WorkspaceUtil;


public class BurpExtensionTerminal implements BurpExtension, ExtensionUnloadingHandler {
    private final TerminalTabbedPane terminalTabbedPane = new TerminalTabbedPane();
    public static MontoyaApi api;

    @Override
    public void initialize(MontoyaApi api) {
        BurpExtensionTerminal.api = api;
        // set extension name
        api.extension().setName("Terminal");

        WorkspaceUtil.initEnv();
        WorkspaceUtil.showBanner(api.logging());

        api.userInterface().menuBar().registerMenu(MenuUtil.initMenu("Terminal"));
        api.userInterface().registerSuiteTab("Terminal", terminalTabbedPane);
        api.extension().registerUnloadingHandler(this);
    }

    @Override
    public void extensionUnloaded() {
        terminalTabbedPane.removeAll();
        api.logging().logToOutput("Terminal Extension Unloaded!");
    }
}
