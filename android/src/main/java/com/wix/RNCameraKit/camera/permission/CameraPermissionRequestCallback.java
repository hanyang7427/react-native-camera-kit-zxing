package com.wix.RNCameraKit.camera.permission;

import com.wix.RNCameraKit.camera.CameraModuleZxing;

public class CameraPermissionRequestCallback {

    private CameraModuleZxing cameraModuleZxing;

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        cameraModuleZxing.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public void setCameraModuleZxing(CameraModuleZxing cameraModuleZxing) {
        this.cameraModuleZxing = cameraModuleZxing;
    }
}
