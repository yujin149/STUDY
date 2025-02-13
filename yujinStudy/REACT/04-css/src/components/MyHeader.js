// MyHeader.js
import React from 'react';
import styles from './MyHeader.module.css';  // CSS 모듈 import

export default function MyHeader() {
  return (
    <div>
      <p className={styles.desc}>회원님에 대한 정보</p> {/* CSS 모듈 클래스 적용 */}
      {/* <div className={styles['sc-banner']}>배너 내용</div> 
      하이픈이 있는 클래스명 사용 
      */}
       {/*
       <div className={`${styles.sc-banner} ${styles.fontL}`}>여러 클래스 적용</div>
       여러 클래스명 적용 */}
    </div>
  );
}
