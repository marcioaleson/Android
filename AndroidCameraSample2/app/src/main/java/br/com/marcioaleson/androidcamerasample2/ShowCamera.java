package br.com.marcioaleson.androidcamerasample2;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import android.content.Context;
import android.hardware.Camera;
import android.os.Environment;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;

public class ShowCamera extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder holdMe;
    private Camera theCamera;

    public ShowCamera(Context context, Camera camera) {
        super(context);
        theCamera = camera;
        holdMe = getHolder();
        holdMe.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        try {
            this.theCamera.setPreviewDisplay(holder);
            this.theCamera.startPreview();
        } catch (IOException e) {
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder arg0) {
        if (theCamera != null) {
            theCamera.stopPreview();
            theCamera.release();
            theCamera = null;
        }
    }

/*    protected void onResume() {
        // TODO Auto-generated method stub
        // deleting image from external storage
        FileHandler.deleteFromExternalStorage();
        // Create an instance of Camera.
        if (this.theCamera == null) {
            this.theCamera = getCameraInstance();
        }
    }*/

}
