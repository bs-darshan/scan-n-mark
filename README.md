
# scan-n-mark
# Attendance Management System (android project) 
<p align="left"> <img src="https://komarev.com/ghpvc/?username=bs-darshan&label=Profile%20views&color=0e75b6&style=flat" alt="bs-darshan" /> </p>

## Overview

The scan N mark is an Android application that enables students or participants to mark their attendance by scanning QR codes. The project uses Firebase Realtime Database for storing attendance data. This README provides an overview of the project, its features, and instructions for setting it up.

## Features

- **QR Code Scanning:** Users can scan QR codes displayed during each session to mark their attendance.

- **Firebase Integration:** Attendance records are stored in Firebase Realtime Database, allowing for real-time data access and synchronization.

- **User Authentication:** Users or students can access account using only admin provided credentials

- **User Roles:** Different roles (e.g., student, instructor, administrator) are supported with varying permissions.

- **Course and Session Management:** Administrators can create courses, schedule sessions, and generate unique QR codes for each session.

- **Attendance Reporting:** Real-time attendance reports are available for administrators, and analytics can be generated.

## Installation

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/bs-darshan/scan-n-mark.git

##steps
Open the project in Android Studio.

   Configure Firebase:
        Create a Firebase project on the Firebase Console.
        Add your google-services.json file to the project (or follow shortcut steps provided in android studio to connect to firebase).
        Set up Firebase Authentication and Realtime Database rules according to your requirements(in firbase website).

   Build and run the project in Android Studio.

##Usage
    Log in using your credentials provided by your institution.

    As an administrator:
      Generate QR codes for each session using desired website or app.
      Access attendance reports and analytics.
      The format of qr code should br in following format.
      #course name//date.
      ex : Algorithms//29 july
      (case senstitive)

    As a student:
        Scan QR codes during sessions to mark your attendance.

Configuration

    Configure Firebase:
        Add your Firebase project configuration to the google-services.json file.

    Customize the security of the QR code or as well as the firebase data structure

Contributing

If you'd like to contribute to this project, please follow these guidelines:

    Fork the repository.
    Create a new branch for your feature or bug fix.
    Make your changes and commit them.
    Push your changes to your fork.
    Submit a pull request.
