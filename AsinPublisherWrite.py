# -*- coding: utf-8 -*-
import boto3, sys

s3Bucket = boto3.client('s3', aws_access_key_id='AKIAI4GKA2HUK5WRS2EA', aws_secret_access_key='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' )
s3Bucket.upload_file( sys.argv[1] , 'asinbucket', 'storedasin.txt' )