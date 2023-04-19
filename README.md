# Kripto 3 Mobile App

# Table of Contents
* [Introduction](#introduction)
* [Prerequisite](#prerequisite)
* [How to Run](#how-to-run)
* [Contributors](#contributors)

## Introduction
This application initially forked from [K-9 Mail](https://github.com/thundernest/k-9).
K-9 Mail is an open source email client for Android devices that allows users to send and receive email messages. It is built using the Kotlin and Java programming languages.

In order to enhance the security of the email messages sent and received through K-9 Mail, encryption and digital signature add-ons have been implemented. It is is integrated with the rest (backend) algorithm. These add-ons are available in two parts of the application: Compose (write) and View (read).

### Compose Add-Ons
The Compose add-ons for K-9 Mail allow users to toggle on/off encryption and digital signature for their outgoing email messages.
- If encryption is enabled, the user is prompted to input a symmetric key that will be used to encrypt the message.
- If digital signature is enabled, the application will generate a private and public key from the server.
- The message will be encrypted/signed when the user clicks the send button.

### View Add-Ons
The View add-ons for K-9 Mail allow users to view the email messages and decrypt/verify the message.
- The default displayed message is the result of sign/encrypt. The signed/decrypted message may contain a very long string of characters without spaces. This can result in a message that appears very small on the screen.
- To decrypt the message, the user can input the symmetric key that was used to encrypt the message then click the ```DECRYPT``` button.
- To verify the message, the user can input the public key for verifying the signature then click the ```VERIFY``` button.
- To do both (decrypt and verify), the user canan fill in both fields above and then click the ```DECRYPT AND VERIFY``` button.
- The application will display the plain message after decryption/verification.

## Prerequisite
- Install [Android Studio](https://developer.android.com/studio)
- Clone this repository
   ```
   https://github.com/blueguy42/kripto-3-fe
   ```

## How to Run
- Open the repository on Android Studio
- Set up the mobile device (emulator or physical)
- Build ```app.k9-mail``` by selecting the configuration and clicking the play button


## Contributors

This project was developed by:

- <a href="https://www.linkedin.com/in/ahmad-alfani-handoyo/">13520023 Ahmad Alfani Handoyo</a>
- <a href="https://www.linkedin.com/in/putri-nurhaliza/">13520066 Putri Nurhaliza</a>
- <a href="https://www.linkedin.com/in/ubaidillah-ariq-prathama-03535a1ba/">13520085 Ubaidillah Ariq Prathama</a>