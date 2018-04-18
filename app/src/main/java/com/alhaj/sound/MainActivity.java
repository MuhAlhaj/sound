package com.alhaj.sound;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUND = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float Right_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;
    ///
    private SoundPool mSoundPool;
    private int mCSoundID;
    private int mDSoundID;
    private int mESoundID;
    private int mFSoundID;
    private int mGSoundID;
    private int mASoundID;
    private int mBSoundID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*

        Button cNote = this.findViewById(R.id.btn_c);
        Button dNote = this.findViewById(R.id.btn_d);
        Button eNote = this.findViewById(R.id.btn_e);
        Button fNote = this.findViewById(R.id.btn_f);
        Button gNote = this.findViewById(R.id.btn_g);
        Button aNote = this.findViewById(R.id.btn_a);
        Button bNote = this.findViewById(R.id.btn_b);
*/
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUND, AudioManager.STREAM_MUSIC,0);
        mCSoundID = mSoundPool.load(getApplicationContext(),R.raw.note1_c,PRIORITY);
        mDSoundID = mSoundPool.load(getApplicationContext(),R.raw.note2_d,PRIORITY);
        mESoundID =mSoundPool.load(getApplicationContext(),R.raw.note3_e,PRIORITY);
        mFSoundID = mSoundPool.load(getApplicationContext(),R.raw.note4_f,PRIORITY);
        mGSoundID = mSoundPool.load(getApplicationContext(),R.raw.note5_g,PRIORITY);
        mASoundID =mSoundPool.load(getApplicationContext(),R.raw.note6_a,PRIORITY);
        mBSoundID =mSoundPool.load(getApplicationContext(),R.raw.note7_b,PRIORITY);
/*
        cNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mCSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        dNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mDSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

            }
        });
        eNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mESoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

            }
        });
        fNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mFSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

            }
        });
        gNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mGSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

            }
        });
        aNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mASoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

            }
        });
        bNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mBSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

            }
        });
*/

    }

    public void playC (View v)
    {
        mSoundPool.play(mCSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playD (View v)
    {
        mSoundPool.play(mDSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playE (View v) {
        mSoundPool.play(mESoundID, LEFT_VOLUME, Right_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

    }
    public void playF (View v)
    {
        mSoundPool.play(mFSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playG (View v)
    {
        mSoundPool.play(mGSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playA (View v)
    {
        mSoundPool.play(mASoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playB (View v)
    {
        mSoundPool.play(mBSoundID,LEFT_VOLUME,Right_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }



}
