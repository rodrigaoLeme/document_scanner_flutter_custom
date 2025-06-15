package com.scanlibrary;

import android.os.Environment;

/**
 * Created by jhansi on 15/03/15.
 * Updated by Rods on 25/06/13
 */
public class ScanConstants {

    public final static int PICKFILE_REQUEST_CODE = 1;
    public final static int START_CAMERA_REQUEST_CODE = 2;
    public final static String OPEN_INTENT_PREFERENCE = "selectContent";
    public final static String IMAGE_BASE_PATH_EXTRA = "ImageBasePath";
    public final static int OPEN_CAMERA = 4;
    public final static int OPEN_MEDIA = 5;
    public final static String SCANNED_RESULT = "scannedResult";
    public final static String IMAGE_PATH = Environment
            .getExternalStorageDirectory().getPath() + "/scanSample";

    public final static String SELECTED_BITMAP = "selectedBitmap";

    // Novas constantes para customização de texto
    public static final String SCAN_NEXT_TEXT = "SCAN_NEXT_TEXT";
    public static final String SCAN_SAVE_TEXT = "SCAN_SAVE_TEXT";
    public static final String SCAN_ROTATE_LEFT_TEXT = "SCAN_ROTATE_LEFT_TEXT";
    public static final String SCAN_ROTATE_RIGHT_TEXT = "SCAN_ROTATE_RIGHT_TEXT";
    public static final String SCAN_ORG_TEXT = "SCAN_ORG_TEXT";
    public static final String SCAN_BNW_TEXT = "SCAN_BNW_TEXT";
    public static final String SCAN_SCANNING_MESSAGE = "SCAN_SCANNING_MESSAGE";
    public static final String SCAN_LOADING_MESSAGE = "SCAN_LOADING_MESSAGE";
    public static final String SCAN_APPLYING_FILTER_MESSAGE = "SCAN_APPLYING_FILTER_MESSAGE";
    public static final String SCAN_CANT_CROP_ERROR_TITLE = "SCAN_CANT_CROP_ERROR_TITLE";
    public static final String SCAN_CANT_CROP_ERROR_MESSAGE = "SCAN_CANT_CROP_ERROR_MESSAGE";
    public static final String SCAN_OK_LABEL = "SCAN_OK_LABEL";
}
