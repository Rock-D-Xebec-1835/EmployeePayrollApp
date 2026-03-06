# Use Case 4: Payslip Print / Download

## Overview

This module ensures payslip data remains immutable once generated and supports safe downloading of payslip copies.

## Objective

Prevent modification of finalized payroll data while allowing downloadable copies.

## Key Concepts

* Immutability
* Cloning
* equals() and hashCode()
* File Persistence
* Download Expiry Token

## Actors

* Authenticated Employee
* FileService

## Flow

1. Payslip is generated.
2. A clone of the payslip is created.
3. Download token is validated.
4. FileService saves payslip as text or PDF.
5. User receives downloadable file.

## Implementation Components

### Immutable Payslip

Final class preventing modification.

Fields:

* Employee ID
* Employee Name
* Month
* Net Pay

### Clone Method

Creates a safe copy of the original object.

### DownloadToken

Controls download validity using time-based expiration.

### FileService

Handles saving payslips to disk.

Supported formats:

* Text
* PDF (simulated)

## Benefits

* Protects original payroll data
* Supports version-safe downloads
* Demonstrates cloning and immutability
