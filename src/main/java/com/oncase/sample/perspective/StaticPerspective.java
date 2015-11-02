package com.oncase.sample.perspective;

import java.util.ArrayList;

import org.pentaho.platform.api.engine.perspective.pojo.IPluginPerspective;
import org.pentaho.ui.xul.XulOverlay;

public class StaticPerspective implements IPluginPerspective {

	private static final long serialVersionUID = 1280540339612668867L;
	private String contentUrl;
	private String id;
	private int layoutPriority;
	private String resourceBundleUri;
	private ArrayList<XulOverlay> overlays;
	private ArrayList<String> requiredSecurityActions;
	private String title;
	

	public String getContentUrl() {
		return this.contentUrl;
	}

	public String getId() {
		return this.id;
	}

	public int getLayoutPriority() {
		return this.layoutPriority;
	}

	public ArrayList<XulOverlay> getOverlays() {
		return this.overlays;
	}

	public ArrayList<String> getRequiredSecurityActions() {
		return this.requiredSecurityActions;
	}

	public String getResourceBundleUri() {
		return this.resourceBundleUri;
	}

	public String getTitle() {
		return this.title;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLayoutPriority(int layoutPriority) {
		this.layoutPriority = layoutPriority;
	}

	public void setOverlays(ArrayList<XulOverlay> overlays) {
		this.overlays = overlays;
	}

	public void setRequiredSecurityActions(ArrayList<String> requiredSecurityActions) {
		this.requiredSecurityActions = requiredSecurityActions;
	}

	public void setResourceBundleUri( String resourceBundleUri ) {
	    this.resourceBundleUri = resourceBundleUri;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
