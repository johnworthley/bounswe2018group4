# Generated by Django 2.0.6 on 2018-11-24 23:20

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('post', '0013_memoryitemmultimedia_media_type'),
    ]

    operations = [
        migrations.CreateModel(
            name='MemoryMultimediaUpload',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('photo', models.FileField(upload_to='memory_image')),
            ],
        ),
    ]